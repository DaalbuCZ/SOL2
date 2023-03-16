.class public abstract Lf7/w;
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
.method public final a(Lf7/k;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/k;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Li7/f;

    invoke-direct {v0, p1}, Li7/f;-><init>(Lf7/k;)V

    invoke-virtual {p0, v0}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lf7/l;

    invoke-direct {v0, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b()Lf7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf7/w$a;

    invoke-direct {v0, p0}, Lf7/w$a;-><init>(Lf7/w;)V

    return-object v0
.end method

.method public abstract c(Ln7/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/a;",
            ")TT;"
        }
    .end annotation
.end method

.method public final d(Ljava/lang/Object;)Lf7/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lf7/k;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Li7/g;

    invoke-direct {v0}, Li7/g;-><init>()V

    invoke-virtual {p0, v0, p1}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    invoke-virtual {v0}, Li7/g;->f0()Lf7/k;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lf7/l;

    invoke-direct {v0, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract e(Ln7/c;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/c;",
            "TT;)V"
        }
    .end annotation
.end method
