.class public final Lg5/q$a;
.super Lg5/o$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lg5/o$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lg5/q$a;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lg5/o$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lg5/o$b;
    .locals 0

    invoke-virtual {p0, p1}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;)Lg5/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lg5/q$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lg5/o$a;->d(Ljava/lang/Object;)Lg5/o$a;

    return-object p0
.end method

.method public g(Ljava/lang/Iterable;)Lg5/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lg5/q$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lg5/o$a;->b(Ljava/lang/Iterable;)Lg5/o$b;

    return-object p0
.end method

.method public h()Lg5/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/q<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg5/o$a;->c:Z

    iget-object v0, p0, Lg5/o$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lg5/o$a;->b:I

    invoke-static {v0, v1}, Lg5/q;->C([Ljava/lang/Object;I)Lg5/q;

    move-result-object v0

    return-object v0
.end method
