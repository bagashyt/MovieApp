package com.bagas.movieapp.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bagas.core.data.source.Resource
import com.bagas.core.domain.model.Movie
import com.bagas.core.domain.usecase.MovieAppUseCase

class MoviesViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {
    fun getMovies(sort: String): LiveData<Resource<List<Movie>>> {
        return movieAppUseCase.getAllMovies(sort).asLiveData()
    }
}