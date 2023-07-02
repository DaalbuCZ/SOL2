.class public final synthetic Lz2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/u$c;


# instance fields
.field public final synthetic a:Lz2/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lz2/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/e;->a:Lz2/f;

    iput-object p2, p0, Lz2/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lz2/u;Lx1/y3;)V
    .locals 2

    iget-object v0, p0, Lz2/e;->a:Lz2/f;

    iget-object v1, p0, Lz2/e;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lz2/f;->F(Lz2/f;Ljava/lang/Object;Lz2/u;Lx1/y3;)V

    return-void
.end method
