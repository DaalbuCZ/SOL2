.class public final Lx9/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx9/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lx9/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lx9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx9/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lr9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx9/b;Lr9/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx9/b<",
            "+TT;>;",
            "Lr9/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/i;->a:Lx9/b;

    iput-object p2, p0, Lx9/i;->b:Lr9/l;

    return-void
.end method

.method public static final synthetic a(Lx9/i;)Lx9/b;
    .locals 0

    iget-object p0, p0, Lx9/i;->a:Lx9/b;

    return-object p0
.end method

.method public static final synthetic b(Lx9/i;)Lr9/l;
    .locals 0

    iget-object p0, p0, Lx9/i;->b:Lr9/l;

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

    new-instance v0, Lx9/i$a;

    invoke-direct {v0, p0}, Lx9/i$a;-><init>(Lx9/i;)V

    return-object v0
.end method
