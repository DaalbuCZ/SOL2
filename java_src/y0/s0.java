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
public class s0 implements p1<List<n0>> {

    /* renamed from: a  reason: collision with root package name */
    private x0 f16696a;

    public s0(x0 x0Var) {
        this.f16696a = x0Var;
    }

    private List<n0> c(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                n0 a10 = this.f16696a.a(scanner.nextLine());
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
    public List<n0> b(File file) {
        try {
            return c(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
