.class public final Lz4/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/g;


# instance fields
.field private final a:La5/g;

.field private final b:La5/g;


# direct methods
.method public constructor <init>(La5/g;La5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/x;->a:La5/g;

    iput-object p2, p0, Lz4/x;->b:La5/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lz4/x;->a:La5/g;

    check-cast v0, Lz4/p;

    invoke-virtual {v0}, Lz4/p;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lz4/x;->b:La5/g;

    invoke-interface {v1}, La5/g;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lz4/w;

    check-cast v1, Lz4/y;

    invoke-direct {v2, v0, v1}, Lz4/w;-><init>(Landroid/content/Context;Lz4/y;)V

    return-object v2
.end method
