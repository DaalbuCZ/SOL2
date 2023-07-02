.class public final Lz4/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/g;


# instance fields
.field private final a:La5/g;


# direct methods
.method public constructor <init>(La5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/z;->a:La5/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz4/z;->a:La5/g;

    check-cast v0, Lz4/p;

    invoke-virtual {v0}, Lz4/p;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lz4/y;

    invoke-direct {v1, v0}, Lz4/y;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
