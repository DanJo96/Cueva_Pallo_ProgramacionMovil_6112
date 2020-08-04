package com.example.chat_cuevapallo.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.chat_cuevapallo.Fragments.chatsFragment;
import com.example.chat_cuevapallo.Fragments.solicitudesFragment;
import com.example.chat_cuevapallo.Fragments.usuariosFragment;

/**
 * The type Paginas adapter.
 */
public class PaginasAdapter extends FragmentStateAdapter
{
    /**
     * Instantiates a new Paginas adapter.
     *
     * @param fragmentActivity the fragment activity
     */
    public PaginasAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
            switch (position) {
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
