.class Lm7/d$a;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm7/d;->create(Lk7/e;Lr7/a;)Lk7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
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

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lk7/e;

.field final synthetic e:Lr7/a;

.field final synthetic f:Lm7/d;


# direct methods
.method constructor <init>(Lm7/d;ZZLk7/e;Lr7/a;)V
    .locals 0

    iput-object p1, p0, Lm7/d$a;->f:Lm7/d;

    iput-boolean p2, p0, Lm7/d$a;->b:Z

    iput-boolean p3, p0, Lm7/d$a;->c:Z

    iput-object p4, p0, Lm7/d$a;->d:Lk7/e;

    iput-object p5, p0, Lm7/d$a;->e:Lr7/a;

    invoke-direct {p0}, Lk7/w;-><init>()V

    return-void
.end method

.method private f()Lk7/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lm7/d$a;->a:Lk7/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm7/d$a;->d:Lk7/e;

    iget-object v1, p0, Lm7/d$a;->f:Lm7/d;

    iget-object v2, p0, Lm7/d$a;->e:Lr7/a;

    invoke-virtual {v0, v1, v2}, Lk7/e;->l(Lk7/x;Lr7/a;)Lk7/w;

    move-result-object v0

    iput-object v0, p0, Lm7/d$a;->a:Lk7/w;

    :goto_0
    return-object v0
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

    iget-boolean v0, p0, Lm7/d$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls7/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lm7/d$a;->f()Lk7/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    iget-boolean v0, p0, Lm7/d$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    invoke-direct {p0}, Lm7/d$a;->f()Lk7/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void
.end method
