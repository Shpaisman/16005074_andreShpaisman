import 'package:anime/modules/anime/anime_controller.dart';
import 'package:anime/modules/anime/anime_model.dart';
import 'package:flutter/material.dart';
import 'anime_model.dart';

class AnimePage extends StatefulWidget {
  @override
  _AnimePageState createState() => _AnimePageState();
}

class _AnimePageState extends State<AnimePage> {
  Future<Results> _resultado;
  AnimeController animeController;

  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Colors.blueGrey,
        resizeToAvoidBottomPadding: false,
        appBar: AppBar(
          title: Text("Esse Anime é Bom?"),
        ),
        body: Column(
          children: [
            TextFormField(
              onFieldSubmitted: (nome) {
                setState(() {
                  _resultado = animeController.fetchAnime(nome);
                });
              },
              textAlign: TextAlign.left,
              style: TextStyle(fontSize: 25.0),
              decoration: InputDecoration(
                  contentPadding:
                      new EdgeInsets.symmetric(vertical: 30.0, horizontal: 30),
                  border: InputBorder.none,
                  prefixIcon: Padding(
                    padding: EdgeInsets.all(0.0),
                    child: Icon(
                      Icons.search,
                      color: Colors.grey,
                    ), // icon is 48px widget.
                  ),
                  hintText: 'Digite o nome de um anime',
                  hintStyle: TextStyle(fontSize: 20.0)),
            ),
            _resultado == null
                ? Text("")
                : FutureBuilder<Results>(
                    future: _resultado,
                    builder: (context, snapshot) {
                      if (snapshot.hasData) {
                        return Column(
                          children: [
                            Image.network(snapshot.data.imageUrl),
                            ListTile(
                              leading: Text(snapshot.data.rated),
                              title: Text(
                                snapshot.data.title,
                                style: TextStyle(fontSize: 20),
                                textAlign: TextAlign.center,
                                overflow: TextOverflow.fade,
                              ),
                              trailing:
                                  Text("${snapshot.data.episodes} Episódios"),
                            ),
                            snapshot.data.rated == "R+"
                                ? Text(
                                    "ESSE ANIME É BOM",
                                    style: TextStyle(
                                        fontSize: 30,
                                        fontWeight: FontWeight.bold,
                                        decoration: TextDecoration.underline),
                                  )
                                : Text(
                                    "ESSE ANIME É RUIM",
                                    style: TextStyle(
                                        fontSize: 30,
                                        fontWeight: FontWeight.bold,
                                        decoration: TextDecoration.underline),
                                  )
                          ],
                        );
                      } else if (snapshot.hasError) {
                        return Text("Erro: ${snapshot.error}");
                      }
                      return CircularProgressIndicator();
                    },
                  )
          ],
        ));
  }
}
