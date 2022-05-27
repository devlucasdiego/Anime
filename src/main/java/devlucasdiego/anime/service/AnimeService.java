package devlucasdiego.anime.service;

import devlucasdiego.anime.domain.Anime;
import devlucasdiego.anime.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L, "Steins Gate"), new Anime(2L, "Demon Slayer"), new Anime(3L, "Cowboy Bebop"));

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime não encontrado"));
    }
}
