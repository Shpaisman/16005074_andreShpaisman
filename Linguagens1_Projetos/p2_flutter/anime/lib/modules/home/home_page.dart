import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Titulo"),
        ),
        body: ListView(
          children: [
            Container(
              child: Text(
                "Bem vindo de volta! Okaeri!",
                style: TextStyle(fontSize: 30),
              ),
              alignment: Alignment.bottomCenter,
            ),
            Container(
              child: Image.asset('assets/images/okaeri.jpg'),
              padding: EdgeInsets.all(70),
            ),
            FlatButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/anime');
                },
                child: Text("ClickMe"))
          ],
        ));
  }
}
