.class final Lk1/e$b;
.super Lk1/k$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lk1/k$b;

.field private b:Lk1/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk1/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lk1/k;
    .locals 4

    new-instance v0, Lk1/e;

    iget-object v1, p0, Lk1/e$b;->a:Lk1/k$b;

    iget-object v2, p0, Lk1/e$b;->b:Lk1/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lk1/e;-><init>(Lk1/k$b;Lk1/a;Lk1/e$a;)V

    return-object v0
.end method

.method public b(Lk1/a;)Lk1/k$a;
    .locals 0

    iput-object p1, p0, Lk1/e$b;->b:Lk1/a;

    return-object p0
.end method

.method public c(Lk1/k$b;)Lk1/k$a;
    .locals 0

    iput-object p1, p0, Lk1/e$b;->a:Lk1/k$b;

    return-object p0
.end method
