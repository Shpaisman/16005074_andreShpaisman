import 'dart:convert';

import 'package:anime/modules/anime/anime_model.dart';

import 'package:http/http.dart' as http;

class AnimeController {
  static String _url = 'https://api.jikan.moe/v3/search/anime?q=';

  Future<Results> fetchAnime(String nome) async {
    try {
      final response = await http.get(_url + nome);

      var animeList = AnimeModel.fromJson(jsonDecode(response.body));

      return animeList.results.elementAt(0);
    } catch (e) {
      print(e.toString());
    }
  }
}
