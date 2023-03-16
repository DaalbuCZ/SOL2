.class Lh7/h$c$a;
.super Lh7/h$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/h$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh7/h<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic r:Lh7/h$c;


# direct methods
.method constructor <init>(Lh7/h$c;)V
    .locals 0

    iput-object p1, p0, Lh7/h$c$a;->r:Lh7/h$c;

    iget-object p1, p1, Lh7/h$c;->n:Lh7/h;

    invoke-direct {p0, p1}, Lh7/h$d;-><init>(Lh7/h;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lh7/h$d;->b()Lh7/h$e;

    move-result-object v0

    iget-object v0, v0, Lh7/h$e;->s:Ljava/lang/Object;

    return-object v0
.end method
