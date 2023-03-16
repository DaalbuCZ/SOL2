.class public final Lj0/a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/a$a;->r(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu9/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic n:Landroidx/core/util/a;


# direct methods
.method public constructor <init>(Landroidx/core/util/a;)V
    .locals 0

    iput-object p1, p0, Lj0/a$a$a;->n:Landroidx/core/util/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lj0/a$a$a;->n:Landroidx/core/util/a;

    invoke-interface {p2, p1}, Landroidx/core/util/a;->accept(Ljava/lang/Object;)V

    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method
