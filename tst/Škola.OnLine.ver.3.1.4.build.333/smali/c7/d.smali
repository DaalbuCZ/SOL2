.class public Lc7/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lga/b;


# instance fields
.field private final a:Lga/b;

.field private final b:La7/h;

.field private final c:Lf7/l;

.field private final d:J


# direct methods
.method public constructor <init>(Lga/b;Le7/k;Lf7/l;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/d;->a:Lga/b;

    invoke-static {p2}, La7/h;->c(Le7/k;)La7/h;

    move-result-object p1

    iput-object p1, p0, Lc7/d;->b:La7/h;

    iput-wide p4, p0, Lc7/d;->d:J

    iput-object p3, p0, Lc7/d;->c:Lf7/l;

    return-void
.end method
