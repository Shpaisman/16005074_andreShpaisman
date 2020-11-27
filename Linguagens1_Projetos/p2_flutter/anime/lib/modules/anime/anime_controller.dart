import 'dart:convert';

import 'package:anime/modules/anime/anime_model.dart';
import 'package:flutter/cupertino.dart';
import 'package:http/http.dart' as http;

class AnimeController {
  String url = 'https://api.jikan.moe/v3/search/anime?q=dororo';

  Future<Results> fetchAnime() async {
    final response = await http.get(url);

    var animeList = AnimeModel.fromJson(jsonDecode(response.body));

    return animeList.results.elementAt(0);
  }
}
