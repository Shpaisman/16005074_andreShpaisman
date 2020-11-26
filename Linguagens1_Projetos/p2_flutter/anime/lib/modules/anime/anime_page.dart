import 'package:flutter/material.dart';

class AnimePage extends StatefulWidget {
  @override
  _AnimePageState createState() => _AnimePageState();
}

class _AnimePageState extends State<AnimePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Consultar anime"),
      ),
      body: Column(
        children: <Widget>[
          Container(
              child: TextFormField(
                decoration: InputDecoration(
                    prefixIcon: Icon(Icons.search),
                    helperText: "Escreva o nome de um anime"),
              ),
              padding: EdgeInsets.fromLTRB(50, 10, 50, 10)),
          FlatButton(
            child: Text("test"),
            onPressed: () {
              
            },
          )
        ],
      ),
    );
  }
}
