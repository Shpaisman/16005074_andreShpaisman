class AnimeModel {
  final String name;
  final String imageUrl;
  final String score;

  AnimeModel({this.name, this.imageUrl, this.score});

  factory AnimeModel.fromJson(Map<String, dynamic> json) {
    return AnimeModel(
      name: json['name'],
      imageUrl: json['imageUrl'],
      score: json['score'],
    );
  }
}
