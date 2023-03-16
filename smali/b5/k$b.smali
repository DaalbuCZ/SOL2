.class final Lb5/k$b;
.super Lb5/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final d:I


# direct methods
.method constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb5/k;-><init>(Lb5/k$a;)V

    iput p1, p0, Lb5/k$b;->d:I

    return-void
.end method


# virtual methods
.method public d(II)Lb5/k;
    .locals 0

    return-object p0
.end method

.method public e(JJ)Lb5/k;
    .locals 0

    return-object p0
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

    return-object p0
.end method

.method public g(ZZ)Lb5/k;
    .locals 0

    return-object p0
.end method

.method public h(ZZ)Lb5/k;
    .locals 0

    return-object p0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lb5/k$b;->d:I

    return v0
.end method
