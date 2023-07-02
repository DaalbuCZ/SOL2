.class final Lk1/i$b;
.super Lk1/o$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lk1/o$c;

.field private b:Lk1/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk1/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lk1/o;
    .locals 4

    new-instance v0, Lk1/i;

    iget-object v1, p0, Lk1/i$b;->a:Lk1/o$c;

    iget-object v2, p0, Lk1/i$b;->b:Lk1/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lk1/i;-><init>(Lk1/o$c;Lk1/o$b;Lk1/i$a;)V

    return-object v0
.end method

.method public b(Lk1/o$b;)Lk1/o$a;
    .locals 0

    iput-object p1, p0, Lk1/i$b;->b:Lk1/o$b;

    return-object p0
.end method

.method public c(Lk1/o$c;)Lk1/o$a;
    .locals 0

    iput-object p1, p0, Lk1/i$b;->a:Lk1/o$c;

    return-object p0
.end method
