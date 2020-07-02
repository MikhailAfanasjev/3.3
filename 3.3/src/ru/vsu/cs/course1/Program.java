package ru.vsu.cs.course1;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
                    java.awt.EventQueue.invokeLater(() -> {
                        try {
                            new FormMain().setVisible(true);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                }
            }


