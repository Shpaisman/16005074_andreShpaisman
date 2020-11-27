import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: ListView(
      children: [
        Stack(
          children: [
            Image.asset('assets/images/okaeri.jpg'),
            Text(
              "Okaeri!!!",
              style: TextStyle(fontSize: 100, color: Colors.black),
            ),
          ],
        ),
        FlatButton(
            color: Colors.yellow,
            height: 150,
            onPressed: () {
              Navigator.pushNamed(context, '/anime');
            },
            child: Text(
              "Vamos julgar seu gosto em anime? Clique aqui!",
              style: TextStyle(fontSize: 30, height: 1),
            ))
      ],
    ));
  }
}
