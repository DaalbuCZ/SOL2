.class Lm7/h$c$a;
.super Lm7/h$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm7/h$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm7/h<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic r:Lm7/h$c;


# direct methods
.method constructor <init>(Lm7/h$c;)V
    .locals 0

    iput-object p1, p0, Lm7/h$c$a;->r:Lm7/h$c;

    iget-object p1, p1, Lm7/h$c;->n:Lm7/h;

    invoke-direct {p0, p1}, Lm7/h$d;-><init>(Lm7/h;)V

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

    invoke-virtual {p0}, Lm7/h$d;->b()Lm7/h$e;

    move-result-object v0

    iget-object v0, v0, Lm7/h$e;->s:Ljava/lang/Object;

    return-object v0
.end method
