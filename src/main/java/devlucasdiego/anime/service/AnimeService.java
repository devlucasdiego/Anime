package devlucasdiego.anime.service;

import devlucasdiego.anime.domain.Anime;
import devlucasdiego.anime.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public static List<Anime> listAll() {
        return List.of(new Anime(1L, "Steins Gate"), new Anime(2L, "Demon Slayer"), new Anime(3L, "Cowboy Bebop"));
    }
}
