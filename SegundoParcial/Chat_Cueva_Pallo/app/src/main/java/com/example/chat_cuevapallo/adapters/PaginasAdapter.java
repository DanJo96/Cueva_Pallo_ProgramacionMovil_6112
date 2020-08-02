package com.example.chat_cuevapallo.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.chat_cuevapallo.fragments.chatsFragment;
import com.example.chat_cuevapallo.fragments.mis_solicitudes_Fragment;
import com.example.chat_cuevapallo.fragments.solicitudesFragment;
import com.example.chat_cuevapallo.fragments.usuariosFragment;

public class PaginasAdapter extends FragmentStateAdapter
{
    public PaginasAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new usuariosFragment();
            case 1:
                return new chatsFragment();
            case 2:
                return new solicitudesFragment();
            default:
                return new usuariosFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
