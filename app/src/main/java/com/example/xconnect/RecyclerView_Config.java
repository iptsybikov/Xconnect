package com.example.xconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerView_Config {
    private Context mContext;
    private BooksAdapter mBooksAdapter;
    public void setConfig(RecyclerView recyclerView, Context context, List<Book> books, List<String> keys){
        mContext = context;
        mBooksAdapter = new BooksAdapter(books, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mBooksAdapter);
    }

    class BookItemView extends RecyclerView.ViewHolder{
        private TextView mAction;
        private TextView mCctv;
        private TextView mName;
        private TextView mDate;
        private TextView mNumber;
        private TextView mPhone;


        private String key;

        public BookItemView(ViewGroup parent) {
            super(LayoutInflater.from(mContext).
            inflate(R.layout.book_list_item, parent,  false));

            mAction = (TextView) itemView.findViewById(R.id.action_txtView);
            mCctv = (TextView) itemView.findViewById(R.id.cctv_txtView);
            mDate = (TextView) itemView.findViewById(R.id.date_txtView);
            mName = (TextView) itemView.findViewById(R.id.name_txtView);
            mNumber = (TextView) itemView.findViewById(R.id.number_txtView);
            mPhone = (TextView) itemView.findViewById(R.id.phone_txtView);

        }
        public void bind(Book book, String key){
            mAction.setText(book.getaction());
            mCctv.setText(book.getcctv());
            mDate.setText(book.getdate());
            mName.setText(book.getname());
            mNumber.setText(book.getnumber());
            mPhone.setText(book.getphone());
            this.key = key;
        }
    }
    class BooksAdapter extends RecyclerView.Adapter<BookItemView> {
        private List<Book> mBookList;
        private List<String> mKeys;

        public BooksAdapter(List<Book> mBookList, List<String> mKeys) {
            this.mBookList = mBookList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public BookItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new BookItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull BookItemView holder, int position) {
            holder.bind(mBookList.get(position), mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return mBookList.size();
        }
    }
}

