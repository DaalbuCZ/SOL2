.class Lb5/k$a;
.super Lb5/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb5/k;-><init>(Lb5/k$a;)V

    return-void
.end method


# virtual methods
.method public d(II)Lb5/k;
    .locals 0

    invoke-static {p1, p2}, Ld5/d;->e(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/k$a;->k(I)Lb5/k;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)Lb5/k;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ld5/f;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/k$a;->k(I)Lb5/k;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lb5/k;"
        }
    .end annotation

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/k$a;->k(I)Lb5/k;

    move-result-object p1

    return-object p1
.end method

.method public g(ZZ)Lb5/k;
    .locals 0

    invoke-static {p1, p2}, Ld5/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/k$a;->k(I)Lb5/k;

    move-result-object p1

    return-object p1
.end method

.method public h(ZZ)Lb5/k;
    .locals 0

    invoke-static {p2, p1}, Ld5/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/k$a;->k(I)Lb5/k;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method k(I)Lb5/k;
    .locals 0

    if-gez p1, :cond_0

    invoke-static {}, Lb5/k;->a()Lb5/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Lb5/k;->b()Lb5/k;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lb5/k;->c()Lb5/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method
