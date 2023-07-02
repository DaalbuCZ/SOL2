.class public final synthetic Ls3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/m$h$a;


# instance fields
.field public final synthetic a:Ls3/m$d;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ls3/m$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/j;->a:Ls3/m$d;

    iput-object p2, p0, Ls3/j;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(ILz2/t0;[I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Ls3/j;->a:Ls3/m$d;

    iget-object v1, p0, Ls3/j;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2, p3}, Ls3/m;->p(Ls3/m$d;Ljava/lang/String;ILz2/t0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
