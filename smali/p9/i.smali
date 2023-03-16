.class public final Lp9/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp9/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lp9/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lp9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lj9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp9/b;Lj9/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/b<",
            "+TT;>;",
            "Lj9/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/i;->a:Lp9/b;

    iput-object p2, p0, Lp9/i;->b:Lj9/l;

    return-void
.end method

.method public static final synthetic a(Lp9/i;)Lp9/b;
    .locals 0

    iget-object p0, p0, Lp9/i;->a:Lp9/b;

    return-object p0
.end method

.method public static final synthetic b(Lp9/i;)Lj9/l;
    .locals 0

    iget-object p0, p0, Lp9/i;->b:Lj9/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lp9/i$a;

    invoke-direct {v0, p0}, Lp9/i$a;-><init>(Lp9/i;)V

    return-object v0
.end method
