.class public final synthetic Ls3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/m$h$a;


# instance fields
.field public final synthetic a:Ls3/m;

.field public final synthetic b:Ls3/m$d;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ls3/m;Ls3/m$d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/l;->a:Ls3/m;

    iput-object p2, p0, Ls3/l;->b:Ls3/m$d;

    iput-boolean p3, p0, Ls3/l;->c:Z

    return-void
.end method


# virtual methods
.method public final a(ILz2/t0;[I)Ljava/util/List;
    .locals 6

    iget-object v0, p0, Ls3/l;->a:Ls3/m;

    iget-object v1, p0, Ls3/l;->b:Ls3/m$d;

    iget-boolean v2, p0, Ls3/l;->c:Z

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ls3/m;->q(Ls3/m;Ls3/m$d;ZILz2/t0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
