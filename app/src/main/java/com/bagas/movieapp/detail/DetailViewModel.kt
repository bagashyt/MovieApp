package com.bagas.movieapp.detail

import androidx.lifecycle.ViewModel
import com.bagas.core.domain.model.Movie
import com.bagas.core.domain.usecase.MovieAppUseCase

class DetailViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) {
        movieAppUseCase.setMovieFavorite(movie, newStatus)
    }
}