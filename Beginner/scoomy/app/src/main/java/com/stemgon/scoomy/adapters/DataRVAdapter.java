package com.stemgon.scoomy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.models.Book;

import java.util.ArrayList;


public class DataRVAdapter extends RecyclerView.Adapter<DataRVAdapter.MyDataViewHolder>{
    Context context;
    ArrayList<Book> books = new ArrayList<>();
    private OnClickListener onClickListener;

    public DataRVAdapter(Context context, ArrayList<Book> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public DataRVAdapter.MyDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        return new MyDataViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DataRVAdapter.MyDataViewHolder holder, int position) {
        holder.book_title.setText((books.get(position)).title);
        holder.book_id.setText(Integer.toString((books.get(position)).id));
        holder.book_author.setText((books.get(position)).author);
        holder.book_pages.setText(Integer.toString((books.get(position)).pages));
        //holder.book_pages.setText("67");
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class MyDataViewHolder extends RecyclerView.ViewHolder {
        TextView book_id;
        TextView book_title;
        TextView book_author;
        TextView book_pages;

        public MyDataViewHolder(@NonNull View itemView) {
            super(itemView);

            book_title = itemView.findViewById(R.id.title);
            book_id = itemView.findViewById(R.id.book_id);
            book_author = itemView.findViewById(R.id.author);
            book_pages = itemView.findViewById(R.id.book_pages);
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(int position, Book model);
    }
}
