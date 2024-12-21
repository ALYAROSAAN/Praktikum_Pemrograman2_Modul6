package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataMahasiswa extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Data Mahasiswa (Hardcoded)
        ObservableList<Mahasiswa> mahasiswaList = FXCollections.observableArrayList(
                new Mahasiswa(1, "12345601", "Isaac Newton"),
                new Mahasiswa(2, "12345602", "Nikola Tesla"),
                new Mahasiswa(3, "12345603", "Thomas Edison"),
                new Mahasiswa(4, "12345604", "Albert Einstein"),
                new Mahasiswa(5, "12345605", "Marie Curie"),
                new Mahasiswa(6, "12345606", "Alexander Graham Bell"),
                new Mahasiswa(7, "12345607", "Galileo Galilei"),
                new Mahasiswa(8, "12345608", "Johannes Gutenberg"),
                new Mahasiswa(9, "12345609", "Charles Darwin"),
                new Mahasiswa(10, "12345610", "Louis Pasteur")
        );

        // Tabel Mahasiswa
        TableView<Mahasiswa> table = new TableView<>();
        table.setItems(mahasiswaList);

        // Kolom ID
        TableColumn<Mahasiswa, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        idColumn.setMinWidth(100);

        // Kolom NIM
        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));
        nimColumn.setMinWidth(200);

        // Kolom Nama
        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        namaColumn.setMinWidth(300);

        // Tambahkan kolom ke tabel
        table.getColumns().addAll(idColumn, nimColumn, namaColumn);

        // Layout
        VBox root = new VBox(table);

        // Scene dan Stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Data Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
