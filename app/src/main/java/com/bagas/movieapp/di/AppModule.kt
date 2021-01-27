package com.bagas.movieapp.di

import com.bagas.core.domain.usecase.MovieAppInteractor
import com.bagas.core.domain.usecase.MovieAppUseCase
import com.bagas.movieapp.detail.DetailViewModel
import com.bagas.movieapp.home.SearchViewModel
import com.bagas.movieapp.movies.MoviesViewModel
import com.bagas.movieapp.tvshows.TvShowsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MovieAppUseCase> { MovieAppInteractor(get()) }
}

@ExperimentalCoroutinesApi
@FlowPreview
val viewModelModule = module {
    viewModel { MoviesViewModel(get()) }
    viewModel { TvShowsViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}

