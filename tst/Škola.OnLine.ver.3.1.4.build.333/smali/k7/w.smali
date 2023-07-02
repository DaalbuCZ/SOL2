.class public abstract Lk7/w;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk7/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/k;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ln7/f;

    invoke-direct {v0, p1}, Ln7/f;-><init>(Lk7/k;)V

    invoke-virtual {p0, v0}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lk7/l;

    invoke-direct {v0, p1}, Lk7/l;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b()Lk7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lk7/w$a;

    invoke-direct {v0, p0}, Lk7/w$a;-><init>(Lk7/w;)V

    return-object v0
.end method

.method public abstract c(Ls7/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")TT;"
        }
    .end annotation
.end method

.method public final d(Ljava/lang/Object;)Lk7/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lk7/k;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ln7/g;

    invoke-direct {v0}, Ln7/g;-><init>()V

    invoke-virtual {p0, v0, p1}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln7/g;->f0()Lk7/k;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lk7/l;

    invoke-direct {v0, p1}, Lk7/l;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract e(Ls7/c;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "TT;)V"
        }
    .end annotation
.end method
