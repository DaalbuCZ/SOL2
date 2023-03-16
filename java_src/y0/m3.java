package y0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/* loaded from: classes.dex */
public class m3 implements p1<List<String>> {
    private List<String> c(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                String nextLine = scanner.nextLine();
                if (nextLine != null && !nextLine.isEmpty()) {
                    arrayList.add(nextLine);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    @Override // y0.p1
    /* renamed from: a */
    public List<String> b(File file) {
        try {
            return c(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
