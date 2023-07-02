.class public final Lo0/a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lca/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/a$a;->p(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lca/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic n:Landroidx/core/util/a;


# direct methods
.method public constructor <init>(Landroidx/core/util/a;)V
    .locals 0

    iput-object p1, p0, Lo0/a$a$a;->n:Landroidx/core/util/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lo0/a$a$a;->n:Landroidx/core/util/a;

    invoke-interface {p2, p1}, Landroidx/core/util/a;->accept(Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method
