package com.example.projectpkl;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.HorizontalViewAdapter> {
    private ArrayList<phone> datalist;

    public ViewAdapter(ArrayList<phone> datalist){
        this.datalist=datalist;
    }


    @NonNull
    @Override
    public HorizontalViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout, parent, false);
        return new HorizontalViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewAdapter holder, final int position) {
        holder.merk.setText(datalist.get(position).getMerk());
        holder.tipe.setText(datalist.get(position).getTipe());
        holder.imagePhone.setImageResource(datalist.get(position).getImg());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), detail_phone.class);
                intent.putExtra("MERK", datalist.get(position).getMerk());
                intent.putExtra("TIPE", datalist.get(position).getTipe());
                intent.putExtra("RAM", datalist.get(position).getRam());
                intent.putExtra("LAYAR", datalist.get(position).getLayar());
                intent.putExtra("CHIP", datalist.get(position).getChip());
                intent.putExtra("INTERNAL", datalist.get(position).getInternal());
                intent.putExtra("KAMERA", datalist.get(position).getKamera());
                intent.putExtra("BATRE", datalist.get(position).getBatre());
                intent.putExtra("IMAGE", datalist.get(position).getImg());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class HorizontalViewAdapter extends RecyclerView.ViewHolder {
        private TextView merk, tipe;
        private ImageView imagePhone;
        private RelativeLayout card;
        public HorizontalViewAdapter(View view) {
            super(view);
            merk = view.findViewById(R.id.merk);
            tipe = view.findViewById(R.id.tipe);
            imagePhone = view.findViewById(R.id.imgphone);
            card = view.findViewById(R.id.card1);

        }
    }
}
