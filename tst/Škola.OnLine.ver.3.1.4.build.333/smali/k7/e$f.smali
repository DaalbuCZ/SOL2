.class Lk7/e$f;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lk7/e$f;->a:Lk7/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lk7/e$f;->a:Lk7/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public f(Lk7/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/w<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lk7/e$f;->a:Lk7/w;

    if-nez v0, :cond_0

    iput-object p1, p0, Lk7/e$f;->a:Lk7/w;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method
