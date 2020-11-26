import 'package:http/http.dart' as http;

class AnimeController  { 
  String url = "https://api.jikan.moe/v3/search/anime?q=Naruto";
  
  Future<http.Response> fetchAlbum() {
  return http.get(url);
}
  }
