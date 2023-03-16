.class final Lu9/a$a;
.super Ld9/d;
.source ""


# annotations
.annotation runtime Ld9/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xe6
    }
    m = "collect"
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu9/a;->a(Lu9/c;Lb9/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field t:I


# direct methods
.method constructor <init>(Lu9/a;Lb9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/a<",
            "TT;>;",
            "Lb9/d<",
            "-",
            "Lu9/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu9/a$a;->s:Lu9/a;

    invoke-direct {p0, p2}, Ld9/d;-><init>(Lb9/d;)V

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu9/a$a;->r:Ljava/lang/Object;

    iget p1, p0, Lu9/a$a;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu9/a$a;->t:I

    iget-object p1, p0, Lu9/a$a;->s:Lu9/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lu9/a;->a(Lu9/c;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
