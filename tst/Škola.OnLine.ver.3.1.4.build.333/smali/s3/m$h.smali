.class abstract Ls3/m$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/m$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ls3/m$h<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final n:I

.field public final o:Lz2/t0;

.field public final p:I

.field public final q:Lx1/n1;


# direct methods
.method public constructor <init>(ILz2/t0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls3/m$h;->n:I

    iput-object p2, p0, Ls3/m$h;->o:Lz2/t0;

    iput p3, p0, Ls3/m$h;->p:I

    invoke-virtual {p2, p3}, Lz2/t0;->b(I)Lx1/n1;

    move-result-object p1

    iput-object p1, p0, Ls3/m$h;->q:Lx1/n1;

    return-void
.end method


# virtual methods
.method public abstract e()I
.end method

.method public abstract g(Ls3/m$h;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
