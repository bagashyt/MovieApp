package com.bagas.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bagas.core.domain.model.Movie
import com.bagas.core.domain.usecase.MovieAppUseCase

class FavoriteViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {

    fun getFavoriteMovies(sort: String): LiveData<List<Movie>> =
        movieAppUseCase.getFavoriteMovies(sort).asLiveData()

    fun getFavoriteTvShows(sort: String): LiveData<List<Movie>> =
        movieAppUseCase.getFavoriteTvShows(sort).asLiveData()

    fun setFavorite(Movie: Movie, newState: Boolean) {
        movieAppUseCase.setMovieFavorite(Movie, newState)
    }
}