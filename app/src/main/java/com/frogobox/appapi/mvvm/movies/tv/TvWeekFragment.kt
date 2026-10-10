package com.frogobox.appapi.mvvm.movies.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.appapi.databinding.FragmentTrendingChildBinding
import com.frogobox.coreutil.movie.MovieUrl
import com.frogobox.coreutil.movie.model.TrendingTv
import com.frogobox.sdk.ext.openDetailImageUri
import com.frogobox.sdk.ext.progressViewHandle
import com.frogobox.sdk.ext.showToast
import com.frogobox.sdk.view.FrogoBindFragment
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass.
 */
@AndroidEntryPoint
class TvWeekFragment : FrogoBindFragment<FragmentTrendingChildBinding>() {

    private val tvViewModel: TvViewModel by viewModels()

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTrendingChildBinding {
        return FragmentTrendingChildBinding.inflate(inflater, container, false)
    }

    override fun setupViewModel() {
        tvViewModel.apply {
            if (listDataWeek.value == null) {
                getTrendingTvWeek()
            }

            eventShowProgressState.observe(viewLifecycleOwner) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(viewLifecycleOwner) {
                requireContext().showToast(it)
            }

            listDataWeek.observe(viewLifecycleOwner) {
                setupRV(it)
            }
        }
    }

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {

    }

    private fun setupRV(data: List<TrendingTv>) {
        val adapter = TvAdapter { tv ->
            requireActivity().openDetailImageUri("${MovieUrl.BASE_URL_IMAGE_ORIGINAL}${tv.poster_path}")
        }
        binding.rvTrending.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvTrending.adapter = adapter
        adapter.submitList(data)
    }

}
