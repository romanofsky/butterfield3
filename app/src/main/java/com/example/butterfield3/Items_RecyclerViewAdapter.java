package com.example.butterfield3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


class Items_RecyclerViewAdapter extends
        RecyclerView.Adapter<Items_RecyclerViewAdapter.MyViewHolder> {

    //set up the 2 variables

    Context context;
    ArrayList<ItemsModel> itemsModels;

    private Items_RecyclerViewAdapter.MyViewHolder holder;
    private int position;

    //set up constructor to get the values for these variables

    public Items_RecyclerViewAdapter(final Context context, final ArrayList<ItemsModel> itemsModels) {

        this.context = context;
        this.itemsModels = itemsModels;
    }

    @NonNull

    @Override

    public Items_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;

    //onCreateViewHolder This is where you inflate the layout (Giving a look to our rows)

    LayoutInflater inflater = LayoutInflater.from( this.context );

        View view=inflater.inflate(R.layout.Recycler_View_Row, parent, attachToRoot:false);
        return new Items_RecyclerViewAdapter.MyViewHolder(view);
}

        @Override
      public void onBindViewHolder(@NonNull Items_RecyclerViewAdapter.MyViewHolder holder,int position); {
        //onBindViewHolder assigning values to the views we created in the recycler_view_row
        //layout file based on the position of the recycler view

        this.holder.tv_items.setText( this.itemsModels.get( this.position ).getItems());
        this.holder.tv_prices.setText( this.itemsModels.get( this.position ).getPrices());
        this.holder.tv_descriptions.setText( this.itemsModels.get( this.position ).getDescriptions());
        this.holder.imageView.setImageResource( this.itemsModels.get( this.position ).getImage());

    }

    @Override
    public int getItemCount() {

        // getItemCount the recycler view just wants to know the number of items you want displayed

        return this.itemsModels.size();
    }

public static class MyViewHolder extends RecyclerView.ViewHolder {

        //inner class MyViewHolder must be public static class
        // grabing the views from our recycler_view_row layout file
        // and assigning them to variables
        // Kinda like in the onCreate method

        ImageView imageView;
        TextView tv_items, tv_prices, tv_descriptions;


        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById( R.id.imageView );
            this.tv_items = itemView.findViewById( R.id.items );
            this.tv_prices = itemView.findViewById( R.id.prices );
            this.tv_descriptions = itemView.findViewById( R.id.descriptions );



        }
    }
}

