.class Lm7/h$b$a;
.super Lm7/h$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm7/h$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm7/h<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic r:Lm7/h$b;


# direct methods
.method constructor <init>(Lm7/h$b;)V
    .locals 0

    iput-object p1, p0, Lm7/h$b$a;->r:Lm7/h$b;

    iget-object p1, p1, Lm7/h$b;->n:Lm7/h;

    invoke-direct {p0, p1}, Lm7/h$d;-><init>(Lm7/h;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lm7/h$d;->b()Lm7/h$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm7/h$b$a;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
