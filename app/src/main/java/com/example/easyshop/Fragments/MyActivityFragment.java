package com.example.easyshop.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.easyshop.Adapters.UserAdapter;
import com.example.easyshop.Models.Users;
import com.example.easyshop.R;
import com.example.easyshop.databinding.FragmentMyActivityBinding;

import java.util.ArrayList;

public class MyActivityFragment extends Fragment {


    public MyActivityFragment() {

    }
    FragmentMyActivityBinding binding;
    ArrayList<Users> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentMyActivityBinding.inflate(inflater, container, false);
        UserAdapter adapter = new UserAdapter(list,getContext());

        binding.recyChat.setAdapter(adapter);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getContext());
//        *******************************************************
//        Add with database
        return binding.getRoot();
    }
}