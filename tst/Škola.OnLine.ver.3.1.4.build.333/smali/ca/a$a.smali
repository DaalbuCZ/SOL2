.class final Lca/a$a;
.super Ll9/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/a;->b(Lca/c;Lj9/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Ll9/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xe6
    }
    m = "collect"
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lca/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field t:I


# direct methods
.method constructor <init>(Lca/a;Lj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/a<",
            "TT;>;",
            "Lj9/d<",
            "-",
            "Lca/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/a$a;->s:Lca/a;

    invoke-direct {p0, p2}, Ll9/d;-><init>(Lj9/d;)V

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lca/a$a;->r:Ljava/lang/Object;

    iget p1, p0, Lca/a$a;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lca/a$a;->t:I

    iget-object p1, p0, Lca/a$a;->s:Lca/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lca/a;->b(Lca/c;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
