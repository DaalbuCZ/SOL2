.class public final Lz4/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/g;


# instance fields
.field private final a:La5/g;

.field private final b:La5/g;

.field private final c:La5/g;


# direct methods
.method public constructor <init>(La5/g;La5/g;La5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/m;->a:La5/g;

    iput-object p2, p0, Lz4/m;->b:La5/g;

    iput-object p3, p0, Lz4/m;->c:La5/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz4/m;->a:La5/g;

    invoke-interface {v0}, La5/g;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lz4/m;->b:La5/g;

    invoke-interface {v1}, La5/g;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/i;

    iget-object v2, p0, Lz4/m;->c:La5/g;

    check-cast v2, Lz4/p;

    invoke-virtual {v2}, Lz4/p;->b()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lz4/l;

    check-cast v0, Lz4/w;

    invoke-direct {v3, v0, v1, v2}, Lz4/l;-><init>(Lz4/w;Lz4/i;Landroid/content/Context;)V

    return-object v3
.end method
