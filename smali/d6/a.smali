.class public final synthetic Ld6/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# static fields
.field public static final synthetic a:Ld6/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld6/a;

    invoke-direct {v0}, Ld6/a;-><init>()V

    sput-object v0, Ld6/a;->a:Ld6/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb6/e;

    invoke-static {p1, p2}, Ld6/d;->b(Ljava/lang/Object;Lb6/e;)V

    return-void
.end method
