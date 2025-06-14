package de.hawhamburg.budgettracker.ui.presets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import de.hawhamburg.budgettracker.databinding.FragmentPresetsBinding;

public class PresetsFragment extends Fragment {

    private FragmentPresetsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PresetsViewModel presetsViewModel =
                new ViewModelProvider(this).get(PresetsViewModel.class);

        binding = FragmentPresetsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPresets;
        presetsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}