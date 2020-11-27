import 'package:anime/modules/anime/anime_controller.dart';
import 'package:anime/modules/anime/anime_model.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'anime_model.dart';

class AnimePage extends StatefulWidget {
  @override
  _AnimePageState createState() => _AnimePageState();
}

class _AnimePageState extends State<AnimePage> {
  Future<Results> _resultado;
  AnimeController animeController = new AnimeController();

  @override
  void initState() {
    super.initState();
    _resultado = animeController.fetchAnime();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Consultar anime"),
        ),
        body: Column(
          children: [
            TextFormField(
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
            FutureBuilder<Results>(
              future: _resultado,
              builder: (context, snapshot) {
                if (snapshot.hasData) {
                  return ListTile(
                    leading: Image.network(snapshot.data.imageUrl),
                    title: Text(
                      snapshot.data.title,
                      style: TextStyle(fontSize: 20),
                      textAlign: TextAlign.center,
                      overflow: TextOverflow.fade,
                    ),
                    trailing: Text("${snapshot.data.episodes} Episódios"),
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
