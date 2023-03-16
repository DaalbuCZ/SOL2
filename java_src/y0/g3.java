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
public class g3 implements p1<List<d3>> {

    /* renamed from: a  reason: collision with root package name */
    private final n3 f16532a;

    public g3(n3 n3Var) {
        this.f16532a = n3Var;
    }

    private List<d3> c(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                d3 a10 = this.f16532a.a(scanner.nextLine());
                if (a10 != null) {
                    arrayList.add(a10);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    @Override // y0.p1
    /* renamed from: a */
    public List<d3> b(File file) {
        try {
            return c(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
